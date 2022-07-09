package dev.wairimu.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(var contactslist:List<Contact>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_list_item,parent,false)
        return ContactsViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact = contactslist.get(position)
        holder.tvName.text = currentContact.name
        holder.tvPhone.text = currentContact.phoneNumber
        holder.tvEmail.text = currentContact.email
        holder.tvAddress.text = currentContact.address
    }

    override fun getItemCount(): Int {
        return  contactslist.size
    }

}


class ContactsViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhone = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
    var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)


}