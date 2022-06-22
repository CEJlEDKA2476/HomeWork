package com.company.organization;

public class Organization {
    Development development;
    Director director;
    Finance finance;
    Marketing marketing;
    Personal personal;
    Planning planning;
    Production production;
    Supply supply;

    Organization(Development development, Director director, Finance finance, Marketing marketing,
                 Personal personal, Planning planning, Production production, Supply supply) {
        this.development = development;
        this.director = director;
        this.finance = finance;
        this.marketing = marketing;
        this.personal = personal;
        this.planning = planning;
        this.production = production;
        this.supply = supply;
    }


}
