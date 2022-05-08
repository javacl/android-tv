package com.huma.sample.features.video.data

import android.content.Context
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import com.huma.sample.R
import com.huma.sample.features.video.data.entities.VideoEntity
import com.huma.sample.features.video.ui.VideoListPresenter
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class VideoLocalDataSource @Inject constructor(
    @ApplicationContext private val context: Context
) {

    fun getVideoList() = flow {
        emit(
            ArrayObjectAdapter(ListRowPresenter()).apply {

                val videoListPresenter = VideoListPresenter()

                val comedyListHeader = HeaderItem(context.getString(R.string.label_comedy))
                val comedyListAdapter = ArrayObjectAdapter(videoListPresenter)
                comedyListAdapter.add(
                    VideoEntity(
                        id = 1,
                        titleFa = "رستگاری در شاوشنک",
                        titleEn = "The Shawshank Redemption",
                        poster = "https://moviesapi.ir/images/tt0111161_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 2,
                        titleFa = "پدر خوانده 1",
                        titleEn = "The Godfather",
                        poster = "https://moviesapi.ir/images/tt0068646_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 3,
                        titleFa = "پدر خوانده 2",
                        titleEn = "The Godfather: Part II",
                        poster = "https://moviesapi.ir/images/tt0071562_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 4,
                        titleFa = "شوالیه تاریکی",
                        titleEn = "The Dark Knight",
                        poster = "https://moviesapi.ir/images/tt0468569_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 5,
                        titleFa = "12 مرد خشن",
                        titleEn = "12 Angry Men",
                        poster = "https://moviesapi.ir/images/tt0050083_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 6,
                        titleFa = "فهرست شیندلر",
                        titleEn = "Schindler's List",
                        poster = "https://moviesapi.ir/images/tt0108052_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 7,
                        titleFa = "قصه عامه پسند",
                        titleEn = "Pulp Fiction",
                        poster = "https://moviesapi.ir/images/tt0110912_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 8,
                        titleFa = "ارباب حلقه ها 3",
                        titleEn = "The Lord of the Rings: The Return of the King",
                        poster = "https://moviesapi.ir/images/tt0167260_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 9,
                        titleFa = "خوب بد زشت",
                        titleEn = "The Good, the Bad and the Ugly",
                        poster = "https://moviesapi.ir/images/tt0060196_poster.jpg"
                    )
                )
                comedyListAdapter.add(
                    VideoEntity(
                        id = 10,
                        titleFa = "باشگاه مشت زنی",
                        titleEn = "Fight Club",
                        poster = "https://moviesapi.ir/images/tt0137523_poster.jpg"
                    )
                )
                add(ListRow(comedyListHeader, comedyListAdapter))

                val imaginaryListHeader = HeaderItem(context.getString(R.string.label_imaginary))
                val imaginaryListAdapter = ArrayObjectAdapter(videoListPresenter)
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 11,
                        titleFa = "ارباب حلقه ها 1",
                        titleEn = "The Lord of the Rings: The Fellowship of the Ring",
                        poster = "https://moviesapi.ir/images/tt0120737_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 12,
                        titleFa = "جنگ ستارگان 5",
                        titleEn = "Star Wars: Episode V - The Empire Strikes Back",
                        poster = "https://moviesapi.ir/images/tt0080684_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 13,
                        titleFa = "فارست گامپ",
                        titleEn = "Forrest Gump",
                        poster = "https://moviesapi.ir/images/tt0109830_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 14,
                        titleFa = "تلقین",
                        titleEn = "Inception",
                        poster = "https://moviesapi.ir/images/tt1375666_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 15,
                        titleFa = "ارباب حلقه ها 2",
                        titleEn = "The Lord of the Rings: The Two Towers",
                        poster = "https://moviesapi.ir/images/tt0167261_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 16,
                        titleFa = "دیوانه ای از قفس پرید",
                        titleEn = "One Flew Over the Cuckoo's Nest",
                        poster = "https://moviesapi.ir/images/tt0073486_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 17,
                        titleFa = "رفقای خوب",
                        titleEn = "Goodfellas",
                        poster = "https://moviesapi.ir/images/tt0099685_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 18,
                        titleFa = "ماتریکس 1",
                        titleEn = "The Matrix",
                        poster = "https://moviesapi.ir/images/tt0133093_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 19,
                        titleFa = "هفت سامورایی",
                        titleEn = "Seven Samurai",
                        poster = "https://moviesapi.ir/images/tt0047478_poster.jpg"
                    )
                )
                imaginaryListAdapter.add(
                    VideoEntity(
                        id = 20,
                        titleFa = "جنگ ستارگان 4",
                        titleEn = "Star Wars: Episode IV - A New Hope",
                        poster = "https://moviesapi.ir/images/tt0076759_poster.jpg"
                    )
                )
                add(ListRow(imaginaryListHeader, imaginaryListAdapter))

                val scientificListHeader = HeaderItem(context.getString(R.string.label_scientific))
                val scientificListAdapter = ArrayObjectAdapter(videoListPresenter)
                scientificListAdapter.add(
                    VideoEntity(
                        id = 21,
                        titleFa = "شهر خدا",
                        titleEn = "City of God",
                        poster = "https://moviesapi.ir/images/tt0317248_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 22,
                        titleFa = "هفت",
                        titleEn = "Se7en",
                        poster = "https://moviesapi.ir/images/tt0114369_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 23,
                        titleFa = "سکوت بره ها",
                        titleEn = "The Silence of the Lambs",
                        poster = "https://moviesapi.ir/images/tt0102926_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 24,
                        titleFa = "زندگی شگفت انگیز",
                        titleEn = "It's a Wonderful Life",
                        poster = "https://moviesapi.ir/images/tt0038650_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 25,
                        titleFa = "مظنونین همیشگی",
                        titleEn = "The Usual Suspects",
                        poster = "https://moviesapi.ir/images/tt0114814_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 26,
                        titleFa = "زندگی زیباست",
                        titleEn = "Life Is Beautiful",
                        poster = "https://moviesapi.ir/images/tt0118799_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 27,
                        titleFa = "لئون حرفه ای",
                        titleEn = "Léon: The Professional",
                        poster = "https://moviesapi.ir/images/tt0110413_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 28,
                        titleFa = "شهر اشباح",
                        titleEn = "Spirited Away",
                        poster = "https://moviesapi.ir/images/tt0245429_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 29,
                        titleFa = "نجات سرباز رایان",
                        titleEn = "Saving Private Ryan",
                        poster = "https://moviesapi.ir/images/tt0120815_poster.jpg"
                    )
                )
                scientificListAdapter.add(
                    VideoEntity(
                        id = 30,
                        titleFa = "روزی روزگاری در غرب",
                        titleEn = "Once Upon a Time in the West",
                        poster = "https://moviesapi.ir/images/tt0064116_poster.jpg"
                    )
                )
                add(ListRow(scientificListHeader, scientificListAdapter))
            }
        )
    }
}
