<html>
    <head>
        <title>La Meteorologia</title>
        <meta charset="utf-8"/>

        <style>
            table, td, th {
                border: 1px solid black;
                border-collapse: collapse;
            }

            td, th {
                padding: 5px;
            }

            th {
                background-color: #a3a3a3;
            }

            td {
                background-color: #fff;
            }
        </style>
    </head>

    <body>
        <p>Provincia: <xsl:value-of select="provincia"/></p>
        <p>Nombre: <xsl:value-of select="nombre"/></p>

        <table>
            <tr>
                <th>Dia</th>
                <th>Temperatura Maxima</th>
                <th>Temperatura Minima</th>
                <th>Estat del cel</th>
            </tr>
            <tr>
                <td align="center"></td>
                <td align="center"><xsl:value-of select="temperatura/maxima"/></td>
                <td align="center"><xsl:value-of select="temperatura/minima"/></td>
                <td align="center"></td>
            </tr>
        </table>
    </body>
</html>