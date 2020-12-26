import { ICommande } from 'app/shared/model/commande.model';

export interface IProduit {
  id?: number;
  nom?: string;
  type?: string;
  prix?: number;
  commandes?: ICommande[];
}

export class Produit implements IProduit {
  constructor(public id?: number, public nom?: string, public type?: string, public prix?: number, public commandes?: ICommande[]) {}
}
