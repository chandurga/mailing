<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" encoding="UTF-8"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>JUnit Test Report</title>
                <style>
                    table { border-collapse: collapse; width: 100%; }
                    th, td { border: 1px solid black; padding: 8px; text-align: left; }
                    th { background-color: #f2f2f2; }
                </style>
            </head>
            <body>
                <h2>JUnit Test Report</h2>
                <table>
                    <tr>
                        <th>Test Case</th>
                        <th>Status</th>
                        <th>Time</th>
                    </tr>
                    <xsl:for-each select="//testcase">
                        <tr>
                            <td><xsl:value-of select="@name"/></td>
                            <td>
                                <xsl:choose>
                                    <xsl:when test="failure">Failed</xsl:when>
                                    <xsl:otherwise>Passed</xsl:otherwise>
                                </xsl:choose>
                            </td>
                            <td><xsl:value-of select="@time"/> s</td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
