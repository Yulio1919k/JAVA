package Garaje2;

public class Vehiculo {
 String Placa;
 String Tipo;
 String Color;
 String Marca;
 byte Pasajero;

 public Vehiculo(String tipo, String placa, String color, String marca, byte pasajero) {
  Tipo = tipo;
  Placa = placa;
  Color = color;
  Marca = marca;
  Pasajero = pasajero;
 }

 public String getPlaca() {
  return Placa;
 }

 public void setPlaca(String placa) {
  Placa = placa;
 }

 public String getTipo() {
  return Tipo;
 }

 public void setTipo(String tipo) {
  Tipo = tipo;
 }

 public String getColor() {
  return Color;
 }

 public void setColor(String color) {
  Color = color;
 }

 public String getMarca() {
  return Marca;
 }

 public void setMarca(String marca) {
  Marca = marca;
 }

 public byte getPasajero() {
  return Pasajero;
 }

 public void setPasajero(byte pasajero) {
  Pasajero = pasajero;
 }
 public boolean equals(Vehiculo otro) {
  return this.Placa.equals(otro.Placa);
 }

 public int compareTo(Vehiculo otro) {
  return this.Placa.compareTo(otro.Placa);
 }
 @Override
 public String toString() {
  return "Vehiculo" + Tipo + "Placa=" + Placa + "Tipo=" + Tipo +
  ", Color='" + Color +", Marca=" + Marca +", Pasajero=" + Pasajero;
 }
}