class User {

    public void viewAllSong(Lagu[] playlist, int lastIndex) {
        for (int i = 0; i < lastIndex; i++) {
            playlist[i].tampilkanInfo();
        }
    }
}
