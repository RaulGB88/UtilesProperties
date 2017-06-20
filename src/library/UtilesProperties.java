/*
 * Copyright 2017 (c) Raúl Granel Blasco.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package library;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 *
 * @author (c) Raúl Granel Blasco
 */
public class UtilesProperties {

    // Fichero > Carga Propiedades
    public static Properties cargarPropiedades(String fichero) {
        // Propiedades
        Properties p;

        // Proceso de carga
        try (FileReader fr = new FileReader(fichero)) {
            // Crear propiedades de la BD
            p = new Properties();

            // Cargar propiedades
            p.load(fr);
        } catch (Exception e) {
            // Mensaje de error
            System.out.println(e.getLocalizedMessage());

            // No Propiedades
            p = null;
        }

        // Devuelve las propiedades
        return p;
    }

    // Guarda Propiedades > Fichero
    public static boolean guardarPropiedades(Properties p, String fichero) {
        // Semáforo Estado
        boolean procesoOK;

        // Proceso de salvaguarda de propiedades
        try (FileWriter fw = new FileWriter(fichero)) {
            // Guarda las propiedades
            p.store(fw, null);

            // Proceso OK
            procesoOK = true;
        } catch (Exception e) {
            // Mensaje de error
            System.out.println(e.getLocalizedMessage());

            // Error
            procesoOK = false;
        }

        // Devuelve Estado
        return procesoOK;
    }

}
