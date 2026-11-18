package zero;

import javafx.scene.input.KeyCode;

/** Common movement and action keys for ordinary Zero game input. */
public enum Key {
    LEFT(KeyCode.LEFT),
    RIGHT(KeyCode.RIGHT),
    UP(KeyCode.UP),
    DOWN(KeyCode.DOWN),
    W(KeyCode.W),
    A(KeyCode.A),
    S(KeyCode.S),
    E(KeyCode.E),
    SPACE(KeyCode.SPACE),
    ENTER(KeyCode.ENTER),
    ESCAPE(KeyCode.ESCAPE);


    private final KeyCode keyCode;

    Key(KeyCode keyCode) { this.keyCode = keyCode; }

    KeyCode fxKeyCode() { return keyCode; }
}
