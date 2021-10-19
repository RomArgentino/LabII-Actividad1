package TrabajoFacultad;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedList;

    class Carreras {
        private String nombre;
        private List<Materias> coleccionMaterias = new ArrayList<Materias>();

        public Carreras(String nombre) {
            this.nombre = nombre;
            this.coleccionMaterias = new ArrayList<Materias>();
        }

        public void agregarMateria(Materias materia){
            coleccionMaterias.add(materia);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public List<Materias> getColeccionMaterias() {
            return coleccionMaterias;
        }

        public void setColeccionMaterias(List<Materias> coleccionMaterias) {
            this.coleccionMaterias = coleccionMaterias;
        }

        public boolean eliminarMateria(String nombreMateria){
            return false;
        }

        public boolean encontrarMateria(String nombreMateria){
            return false;
        }


        public String toString() {
            return "\nCarreras: " + nombre +
                    "\nMaterias: " + coleccionMaterias;
        }


    }

