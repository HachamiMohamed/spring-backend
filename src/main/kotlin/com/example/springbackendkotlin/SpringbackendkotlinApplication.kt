package com.example.springbackendkotlin


import com.example.springbackendkotlin.dao.CategoryRepository
import com.example.springbackendkotlin.dao.ProductRepository
import com.example.springbackendkotlin.data.Category
import com.example.springbackendkotlin.data.Product
import net.bytebuddy.utility.RandomString
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class SpringbackendktApplication: CommandLineRunner{

    @Autowired
    var productRepository: ProductRepository? = null

    @Autowired
    var categoryRepository: CategoryRepository? = null

    override fun run(vararg args: String?) {

        categoryRepository!!.save(Category(null, "Computers", null, null))
        categoryRepository!!.save(Category(null, "Printers", null, null))
        categoryRepository!!.save(Category(null, "Smartphones", null, null))
        val rnd = Random()
        categoryRepository!!.findAll().forEach { category ->
            for (i in 0..9) {
                val p = Product()
                p.name = RandomString.make(10)
                p.currentPrice =(100 + rnd.nextInt(10000)).toDouble()
                p.availabe =(rnd.nextBoolean())
                p.selected=(rnd.nextBoolean())
                p.category=(category)
                p.photoName=("unknown.png")
                productRepository!!.save(p)
            }
        }

    }
}
fun main(args: Array<String>) {
    runApplication<SpringbackendktApplication>(*args)
}
