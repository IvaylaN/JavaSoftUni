package JavaFundamentals.MiddleExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3MusicPlaylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial list of songs
        String[] initialSongs = scanner.nextLine().split(" ");
        List<String> playlist = new ArrayList<>();
        Collections.addAll(playlist, initialSongs);

        // Read the number of commands
        int n = Integer.parseInt(scanner.nextLine());

        // Process each command
        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(" \\* ");
            String command = commandParts[0];

            switch (command) {
                case "Add Song":
                    String songToAdd = commandParts[1];
                    if (!playlist.contains(songToAdd)) {
                        playlist.add(songToAdd);
                        System.out.println(songToAdd + " successfully added");
                    }
                    break;
                case "Delete Song":
                    int numberOfSongsToDelete = Integer.parseInt(commandParts[1]);
                    if (numberOfSongsToDelete <= playlist.size()) {
                        List<String> deletedSongs = new ArrayList<>(playlist.subList(0, numberOfSongsToDelete));
                        playlist.subList(0, numberOfSongsToDelete).clear();
                        System.out.println(String.join(", ", deletedSongs) + " deleted");
                    }
                    break;
                case "Shuffle Songs":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    if (index1 >= 0 && index1 < playlist.size() && index2 >= 0 && index2 < playlist.size()) {
                        Collections.swap(playlist, index1, index2);
                        System.out.println(playlist.get(index1) + " is swapped with " + playlist.get(index2));
                    }
                    break;
                case "Insert":
                    String songToInsert = commandParts[1];
                    int insertIndex = Integer.parseInt(commandParts[2]);
                    if (insertIndex >= 0 && insertIndex <= playlist.size()) {
                        if (!playlist.contains(songToInsert)) {
                            playlist.add(insertIndex, songToInsert);
                            System.out.println(songToInsert + " successfully inserted");
                        } else {
                            System.out.println("Song is already in the playlist");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Sort":
                    playlist.sort(Collections.reverseOrder());
                    break;
                case "Play":
                    System.out.println("Songs to Play:");
                    for (String song : playlist) {
                        System.out.println(song);
                    }
                    break;
            }
        }
    }
}

