package lecoincoin

class Illustration {

    String filename

    // On ne crée pas de relations inverse il est impossible pour nous de retrouver l'annonce à partir d'une illustrations
    static belongsTo = SaleAd
    static constraints = {

        filename nullable: false, blank: false
    }
}
