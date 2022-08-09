package org.metable.hex.soccer.application.ports.output;

public interface UndoRedoPort {
    boolean canUndo();

    void undo();

    void redo();
}
