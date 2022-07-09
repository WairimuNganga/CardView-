package dev.wairimu.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wairimu.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = Contact("Abby","07929295684","abe@gmail.com","126 Utawala","")
        var contact2= Contact("Linda","07929295684","linda@gmail.com","354 Loresho","")
        var contact3 = Contact("Jessy","07929295684","jessy@gmail.com","234 Uthiru","")
        var contact4 = Contact("Lisa","07929295684","lisa@gmail.com","890 Kilimani","")
        var contact5= Contact("Ziah","07929295684","ziah@gmail.com","782 Yemen","")
        var contact6 = Contact("Ciah","07929295684","ciah@gmail.com","983 Kilimani","")
        var contact7 = Contact("Jacky","07929295684","jacky@gmail.com","126 Texus","")
        var contact8= Contact("Luisa","07929295684","luisa@gmail.com","526 Lavington","")
        var contact9 = Contact("Hannah","07929295684","hannah@gmail.com","106 Milimani","")
        var contactList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9)
        var contactsAdapter =ContactsAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}