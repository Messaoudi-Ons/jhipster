import { Moment } from 'moment';

export interface ICommande {
  id?: number;
  commande?: string;
  dateCom?: Moment;
  produitId?: number;
}

export class Commande implements ICommande {
  constructor(public id?: number, public commande?: string, public dateCom?: Moment, public produitId?: number) {}
}
