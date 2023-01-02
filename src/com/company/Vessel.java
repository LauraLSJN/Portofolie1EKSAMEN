package com.company;

public abstract class Vessel {
    //Linje 5-8 er attributter angivet i opgavebeskrivelsen
    String flagNation;
    int aDraft; //Skippets vertikale distance mellem vandlinjen og bunden af skibet -> Kan anvendes ift. ruter, hvor vandoverfladen og bunden ikke er dyb nok
    int length;
    int width;
    int procent;

    public abstract int utilityLevelOfCapacity();

    //loadingCargo ej implementeret -> containerVessel tager et argumenter i paramteren, hvor det i de resterende tager to
}
