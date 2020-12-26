export interface IFacture {
  id?: number;
  montant?: number;
  modepayement?: string;
  produitId?: number;
}

export class Facture implements IFacture {
  constructor(public id?: number, public montant?: number, public modepayement?: string, public produitId?: number) {}
}
