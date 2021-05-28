package com.revature.assigments.p1.util;

import java.util.Map;

public class HtmlBuilder {

    public static String buildHtmlTable(String tableName,Map<?,?> tableMap){
        StringBuilder htmlString = new StringBuilder();
        //Insert font's links
        htmlString.append("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n" +
                "<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100;400&display=swap\" rel=\"stylesheet\">\n");

        //Insert inline css style
        htmlString.append(  "<style>\n" +
                "    h1{\n" +
                "        font-family: 'Roboto', sans-serif;\n" +
                "    }\n" +
                "    table.customTable {\n" +
                "\n" +
                "      font-family: 'Roboto', sans-serif;\n" +
                "      width: 100%;\n" +
                "      background-color: #FFFFFF;\n" +
                "      border-collapse: collapse;\n" +
                "      border-width: 3px;\n" +
                "      border-color: white;\n" +
                "      border-style: solid;\n" +
                "      color: #000000;\n" +
                "    }\n" +
                "\n" +
                "    table.customTable td, table.customTable th {\n" +
                "      font-family: 'Roboto', sans-serif;\n" +
                "      border-width: 2px;\n" +
                "      border-color:white;\n" +
                "      border-style: solid;\n" +
                "      padding: 5px;\n" +
                "    }\n" +
                "\n" +
                "    table.customTable .header-text{\n" +
                "        font-weight: bolder;\n" +
                "    }\n" +
                "\n" +
                "    table.customTable thead {\n" +
                "      text-align: left;\n" +
                "      font-weight: 400;\n" +
                "      background-color: #fea82f;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "</style>\n");

        //Building the table
        htmlString.append("<table class=\"customTable\">\n").append("  <h1>"+ tableName +"</h1>\n");
        //Inserting Header
        htmlString.append("  <thead>\n");
        tableMap.entrySet().stream().forEach(e -> htmlString.append("      <th class = header-text>"+e.getKey()+"</th>\n"));
        htmlString.append("  </thead>\n");
        //Insert row
        htmlString.append("<tr>\n");
        tableMap.entrySet().stream().forEach(e-> htmlString.append("      <td>"+e.getValue()+"</td>\n"));
        htmlString.append("</tr>\n");
        htmlString.append("</table>");

        //Return htmlString
        return String.valueOf(htmlString);
    }

}

