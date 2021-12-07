package den.project.newsapplication.di

import den.project.newsapplication.model.NewsModel
import org.koin.dsl.module

val newsModule = module {

    single {
        NewsModel()
    }

}