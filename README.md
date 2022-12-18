# Simple-bankloan
Jeg har skrevet denne oppgaven i sammenheng med en jobbsøknad. Oppgaveteksten og koden er endret slik at det ikke kan spores tilbake til den originale teksten.

En kunde oppsøker banken for å låne penger. Banken må avgjøre om kunden får innvilget lån hos dem eller ikke ift inntekten til kunden. Hvis kunden får innvilget lån, så skal man beregne hvor mye kunden må betale tilbake per måned.

Banken har bestemt for et terskelbeløp (TB) av 120 000 kroner som de bruker i sine beregninger og for enkelhetens skyld må kunden betale lånet tilbake i 48 måneder. For å få innvilget lån hos banken, må kunden ha tjent enten mer enn 4 * TB i de siste 4 årene eller mer enn 2 * TB i det siste året. 

Hvis kunden får lån fra banken, blir lånet beregnet slik at lånet er gjennomsnittlige inntekten av de siste 4 årene hvis denne er et større beløp enn inntekten i det siste året. Hvis det ikke er tilfelle, så blir lånet samme beløp som inntekten i det siste året. Samtidig kan lånet være maks 7 * TB. Altså hvis gjennomsnittlige inntekten av de siste 4 årene eller inntekten i det siste året skulle overgå dette beløpet, blir lånet uansett 7 * TB.

Banken spør om kunden får innvilget lån og hvis ja, hvor mye må den betale tilbake per måned.
