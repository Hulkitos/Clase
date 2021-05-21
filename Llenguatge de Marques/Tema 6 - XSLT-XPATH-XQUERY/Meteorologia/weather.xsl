<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
    <xsl:output method="html" omit-xml-declaration="yes"/>
    <xsl:template match="/">
        <html>
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
                                        Despejado
                                    </xsl:when>
                                    <xsl:otherwise>
                                        Nubloso
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

