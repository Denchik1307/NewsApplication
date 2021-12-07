package den.project.newsapplication.di

import den.project.newsapplication.model.FilterModel
import org.koin.dsl.module

val filterNewsModule = module {

    single {
        FilterModel().newsFilter
    }

}