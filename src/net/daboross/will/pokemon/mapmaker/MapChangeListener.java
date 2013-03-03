package net.daboross.will.pokemon.mapmaker;

public interface MapChangeListener {

    public void mapChanging(boolean major);

    public void mapChanged(boolean major);
}
