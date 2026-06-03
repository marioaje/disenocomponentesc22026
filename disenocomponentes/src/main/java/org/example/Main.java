package org.example;

import java.net.URI;
import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import org.example.models.Saludo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      try{
//           un objeto json
//          {
//              key:valor,
//              datos:{
//                }
//          }

          String json = """
                    {
                        "coleccion":"profMario",
                            "datos":{
                                        "fecha":"2026-10-11 20:30:00",
                                        "modulo":"Usuarios",
                                        "mensaje":"Error al insertar usuario",
                                        "detalle":"Llave primaria duplicada",
                                        "codigo":"003",
                                        "usuario":"mario"
                                    }
                    }
                """;


          HttpClient cliente = HttpClient.newHttpClient();
          HttpRequest request = HttpRequest.newBuilder()
                  .uri(URI.create("https://paginas-web-cr.com/Api/apis/mongodb.php"))
                  .header("Content-Type", "application/json")
                  .POST(HttpRequest.BodyPublishers.ofString(json))
                  .build();

          HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());


          System.out.println("cod:" + response.statusCode());
          System.out.println(response.body());
      }catch(Exception e){
          e.printStackTrace();
      }



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      //  Saludo saludo = new Saludo();
        //saludo.mostrarSaludo("Prof Mario");
     //   System.out.println(saludo.mostrarSaludo("Prof Mario"));
    }
}

//
//⚙️ Funcionalidades Requeridas
//
//El componente debe permitir:
//        1. Registrar Errores
//
//Al producirse un error, el componente deberá enviar la información al siguiente API mediante método POST:
//
//Endpoint
//
//https://paginas-web-cr.com/Api/apis/mongodb.php
//
//Ejemplo de envío
//
//{
//    "coleccion":"erroresNombreApellidoEstudiante",
//        "datos":{
//    "fecha":"2026-10-01 20:30:00",
//            "modulo":"Usuarios",
//            "mensaje":"Error al insertar usuario",
//            "detalle":"Llave primaria duplicada",
//            "usuario":"mario"
//}
//}