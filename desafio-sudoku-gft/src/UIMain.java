import br.com.scarlet.ui.custom.screen.MainScreen;


import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UIMain {
    public static void main(String[] args) {
        final var gameConfig = Stream.of(args)
                .collect(toMap(
                        arg -> arg.split(";")[0],
                        arg -> arg.split(";")[1]
                ));

        var mainScreen = new MainScreen(gameConfig);
        mainScreen.buildMainScreen();
    }
}
