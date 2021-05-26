<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
    <xsl:output method="html" omit-xml-declaration="yes"/>
    <xsl:template match="/">
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
                <xsl:for-each select="root">
                    <p>Provincia: <xsl:value-of select="provincia"/></p>
                    <p>Nombre: <xsl:value-of select="nombre"/></p>
                </xsl:for-each>
                <table>
                    <tr>
                        <th>Dia</th>
                        <th>Temperatura Maxima</th>
                        <th>Temperatura Minima</th>
                        <th>Estat del cel</th>
                    </tr>
                    <xsl:for-each select="root/prediccion/dia">
                        <tr>
                            <td align="center"><xsl:value-of select="@fecha"/></td>
                            <td align="center"><xsl:value-of select="temperatura/maxima"/></td>
                            <td align="center"><xsl:value-of select="temperatura/minima"/></td>
                            <td align="center">
                                <xsl:choose>
                                    <xsl:when test="estado_cielo/@descripcion = Despejado">
                                            <img src="sol-solet.jpg" />
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <img src ="nuvol.jpg" height="20px"/>
                                    </xsl:otherwise>
                                </xsl:choose>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>