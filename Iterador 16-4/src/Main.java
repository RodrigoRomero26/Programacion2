public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Messi", "Delantero", 10);
        Player player2 = new Player("Bigote", "Delantero", 12);
        Player player3 = new Player("Juani", "Defensor", 7);
        Team team1 = new Team("NRJ");
        team1.addPlayers(player1);
        team1.addPlayers(player2);
        team1.addPlayers(player3);
        for (Player player : team1){
            System.out.println("Equipo:"+team1.getName()+ " Jugador numero: "+player.getJersey_num()+" Nombre: "+player.getName()+" Posicion: "+player.getPosition());
        }
    }
}