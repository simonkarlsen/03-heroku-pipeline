# Kontinuerlig deployment til Heroku Pipeline med Travis

Målet med oppgaven er at Travis skal gjøre kontinuerlig deployment av applikasjonen fra master branch- men at endringen ikke skal gå "live" før du selv velger å promotrere applikasjonen som er i "staging". 

Vi har etter denne øvelsen tre viktige ting på plass

* Versjonskontroll - Github passer på koden !
* CI - kontinuerlig integrasjon. Travis passer på at Master branch er i en konstang god tilstand. Koden kompilerer alltid, tester er alltid "grønne"
* Travis passer deployer kontinuerlig siste versjon av Master til  et "staging" miljøe, som vi typisk tester i. Travis deployer hver pull request
til en egen "review app".
* Vi kan manuelt "promotere" staging -> live. Live er det miljøet som brukere opplever.

## Lag en ny app

* Pass på at du har et GitHub repo med en enkel Spring boot app - Du kan alternativt lage en fork av dette repoet
* Sett opp Travis integrasjon for repoet
* Sett opp en Heroku app - som kjører spring boot applikasjonen. 

## Lag en pipeline

- Lag en Heroku pipeline https://devcenter.heroku.com/articles/pipelines - NB! *stopp ved "Pipelines ownership and transfer"*
Når du har fulgt instruksjonene, skal dere sørge for at deres egen Spring Boot applikasjon er deployet i Heroku pipelinen dere lager
- Slå på "Review apps" https://devcenter.heroku.com/articles/github-integration-review-apps

## Test følgende

- Lag en Pull request i repoet. Bygger Travis pull request? Lager Heroku en review app?
- Merge pull requesten til master.
- Gjør en manuelt push av master branch til heroku (git push heroku master). Se at "Staging" applikasjonen endrer seg
- Promoter staging applikasjonen til prod
- Se at prod applikasjonen oppdaterer seg.


## Bonusoppgaver

* Begynn å se på feature toggles -Quick start guide er her; https://www.togglz.org/
* Begynn å se på Terraform - https://www.terraform.io/
