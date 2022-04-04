package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import html.Html;
import models.PlayerModel;
import utilities.DBUtils;

@WebServlet(name = "GetPlayerServlet", value = "/GetPlayerServlet")
public class GetPlayerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String pname = request.getParameter("pname");
        PrintWriter out = response.getWriter();

        try {
            PlayerModel model = getPlayer(pname, out);
            double killdeathRatio = getRatio(model.getKills(), model.getDeaths());

            Html.Start(out, "Player stats:");
            out.println("Ingame nick: " + model.getNickname() + "<br/>");
            out.println("Total score: " + model.getScore() + "<br/>");
            out.println("Rounds played: " + model.getRoundsPlayed() + "<br/>");
            out.println("Flag captures: " + model.getCaptures() + "<br/>");
            out.println("Kills: " + model.getKills() + "<br/>");
            out.println("Deaths: " + model.getDeaths() + "<br/>");
            out.println("Player KD-ratio: " + killdeathRatio);
            if (killdeathRatio > 3) {
                out.print("<br/><h3>Certified 1337 player ;)</h3>");
            }
            Html.EndBasic(out);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    }

    private PlayerModel getPlayer(String pname, PrintWriter out) throws SQLException {
        Connection db = null;
        try {
            db = DBUtils.getINSTANCE().getConnection(out);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String query3 = "SELECT name, score, rounds, kills, deaths, captures  FROM player WHERE name = ?";
        PreparedStatement statement = db.prepareStatement(query3);
        statement.setString(1, pname);
        ResultSet rs = statement.executeQuery();
        PlayerModel model = null;
        while (rs.next()) {
            model =
                new PlayerModel(
                    rs.getString("name"),
                    rs.getInt("score"),
                    rs.getInt("rounds"),
                    rs.getInt("kills"),
                    rs.getInt("deaths"),
                    rs.getInt("captures")
                );
        }
        return model;
    }

    //To circumvent int not wanting to give decimals. Also cuts off too many decimals.
    double getRatio(float a, float b) {
        return (Math.round((a/b)*100.0)/100.0);
    }

}

