/*validar as entidades as quais tem os atributos que realmente deveriam ter*/
/*Convite aponta para ConviteBusiness*/

package entity

//tipo e codigo são os atributos da classe entity.Convite
class Convidado(var tipo: String = "", var codigo: String = "", val idade: Int) {
}