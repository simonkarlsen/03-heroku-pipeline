# Kontinuerlig deployment til Heroku med Pipeline

Målet med oppgaven er at Travis skal gjøre kontinuerlig deployment av applikasjonen fra master branch- men at endringen ikke skal gå "live" før du selv velger å promotrere applikasjonen som er i "staging". 

Vi har nå tre viktige ting på plass

* CI - kontinuerlig integrasjon, 

Lag en ny heroku pipeline
Øvingen bygger på det vi har gjort så langt,så før du begynner - sørg for at du har følgende på plass

Et GitHub repo med en Spring boot app
At Travis bygger på hver commit til master i repoet
At du har en Heroku App - som kjører Spring Boot applikasjonen.
Du kan oppdatere Heroku ved å gjøre feks en "push heroku master"
Se på instruksjonene i Heroku dokumentasjon
Dagens oppgave er å bli kjent med Heroku pipelines. Etter dagens øvings skal dere selv ha et miljø som ble demonstrert på forelesning 3.

Lag en Heroku pipeline https://devcenter.heroku.com/articles/pipelines - stopp ved "Pipelines ownership and transfer"

Når du har gjort eksempelet, skal dere sørge for at deres egen Spring Boot applikasjon er deployet i Heroku pipelinen dere lager

Her skal du bruke applikasjonen fra forrige lab i pipeline i "Staging".
Lag en ny app for production
Legg feature toggles til applikasjonen
Togglz rammeverket kan brukes til dette;

https://github.com/togglz/togglz

Quick start guide er her; https://www.togglz.org/

For eksempel på bygg med gradle og Javakode kan dere se på min demo-applikasjon - https://github.com/glennbech/demo32 -

