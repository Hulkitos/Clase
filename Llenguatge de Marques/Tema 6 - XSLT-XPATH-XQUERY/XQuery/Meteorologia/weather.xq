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
        <p>Provincia:</p>
        <p>Nombre:</p>

        <table>
            <tr>
                <th>Dia</th>
                <th>Temperatura Maxima</th>
                <th>Temperatura Minima</th>
                <th>Estat del cel</th>
            </tr>
            {
             for $var in doc("weather.xml")/root/prediccion/dia/@fecha
                return
                <td>{$var}</td>
             }
        </table>
    </body>
</html>