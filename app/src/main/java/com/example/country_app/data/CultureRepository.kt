package com.example.country_app.data
import com.example.country_app.R

class CultureRepository {

    fun getCategories(): List<CultureCategory> = listOf(
        CultureCategory(
            id = 1,
            title = "History",
            description = "Learn about the historical events that shaped our identity.",
            introImageRes = R.drawable.flag_of_ethiopiaa,
            contentSections = listOf(
                ContentSection(
                    title = "Ethiopia",
                    content = "Ethiopia, one of the oldest nations in the world, boasts a rich and diverse history that spans thousands of years. It is the cradle of humanity, with fossil evidence suggesting that the earliest ancestors of modern humans lived in the region. Ethiopia's history is deeply rooted in the Kingdom of Aksum, which flourished between the 1st and 7th centuries AD, and was one of the greatest civilizations of the ancient world. The Kingdom of Aksum was renowned for its advanced architecture, coinage, and Christianity, which became the state religion in the 4th century, making Ethiopia one of the earliest nations to adopt Christianity.\n" +
                            "\n" +
                            "Throughout its history, Ethiopia maintained its independence, successfully repelling foreign invasions, including the Italian occupation in the late 19th century. The Battle of Adwa in 1896 remains a symbol of Ethiopian resistance and victory against colonialism. Ethiopia is also known for being the only African country that was never colonized, preserving its unique cultural heritage. In modern times, the country has undergone significant political and social changes, including the overthrow of the monarchy in 1974 and the establishment of the current federal system.\n" +
                            "\n" +
                            "Ethiopia's history is marked by its deep connection to religion, diverse ethnic groups, and cultural traditions that continue to shape the country today.",
                    imageRes = R.drawable.etmap
                ),
                ContentSection(
                    title = "Nature of Ethiopia",
                    content = "Ethiopia is renowned for its stunning and diverse natural landscapes, ranging from vast highlands to lowland deserts. The country is home to some of Africa’s most breathtaking scenery, including the Simien and Bale Mountains, which are both UNESCO World Heritage sites. Ethiopia’s lakes, such as Lake Tana and the Danakil Depression, offer a striking contrast of tranquility and extremes. The Great Rift Valley runs through Ethiopia, contributing to its fertile soil and rich biodiversity. From lush forests to arid deserts, Ethiopia's nature is a testament to the country's geological wonders and ecological diversity, providing habitats for unique wildlife such as the Ethiopian wolf and gelada baboon.",
                    imageRes = R.drawable.nature
                ),
                ContentSection(
                    title = "Cities of Ethiopia",
                    content = "Ethiopia's cities are a blend of modernity and ancient charm, each with its own distinct character. Addis Ababa, the capital, is a bustling metropolis and the political hub of Africa, home to the African Union and numerous international organizations. It is a city where contemporary buildings rise alongside historical landmarks, like the National Museum and the Holy Trinity Cathedral. Other cities, such as Lalibela, are famous for their rock-hewn churches, while Bahir Dar and Gondar are known for their beautiful lakes and castles. Ethiopian cities are not only rich in history and culture but also serve as gateways to the country's breathtaking landscapes, offering vibrant markets, delicious cuisine, and warm hospitality.",
                    imageRes = R.drawable.et
                )
            )
        ),
        CultureCategory(
            id = 2,
            title = "Art",
            description = "Discover the visual arts that define our culture.",
            introImageRes = R.drawable.et_art,
            contentSections = listOf(
                ContentSection(
                    title = "The Origins of Art",
                    content = "Ethiopia, a country rich in history and cultural heritage, has a long tradition of artistic expression that dates back thousands of years. The origins of Ethiopian art are deeply intertwined with the nation’s religious, social, and political landscapes, with its unique development shaped by indigenous practices, Christian influences, and later interactions with other cultures.",
                    imageRes = null // No image for this section
                ),
                ContentSection(
                    title = "Prehistoric Art",
                    content = "Ethiopia’s artistic heritage can be traced back to prehistoric times, with evidence of early human presence in the region, such as rock art found in the highlands. The rock paintings in places like the Tiya archaeological site are among the earliest forms of artistic expression in Africa. These paintings often depict animals, humans, and abstract motifs, reflecting the spiritual and cultural beliefs of the people during that era.",
                    imageRes = R.drawable.art // Example image
                ),
                ContentSection(
                    title = "Religious Influence",
                    content = "The most prominent influence on Ethiopian art has been its connection to Christianity, particularly after the establishment of Christianity as the state religion in the 4th century. The Ethiopian Orthodox Church, one of the oldest Christian churches in the world, has played a central role in shaping the visual arts in the country. Ancient manuscripts, illuminated with vibrant colors and intricate designs, are a prime example of religious art in Ethiopia. These manuscripts, created by skilled scribes and artists, depict biblical stories, saints, and religious symbols, and they are often highly decorative, using gold leaf, vibrant pigments, and geometric patterns.",
                    imageRes =  R.drawable.religion
                )
            )
        ),
        CultureCategory(
            id = 3,
            title = "Traditions",
            description = "Ethiopia's traditions are a vibrant blend of ancient customs, diverse cultures, and deep-rooted values. From colorful festivals like Timket and Meskel to unique coffee ceremonies, Ethiopia's heritage reflects its rich history and unity in diversity.",
            introImageRes = R.drawable.tradition_pic,
            contentSections = listOf(
                ContentSection(
                    title = "Tradition in Ethiopia",
                    content = " Ethiopia, often referred to as the birthplace of humanity, is a country rich in cultural traditions that have been passed down through generations. One of the most significant aspects of Ethiopian culture is its deep connection to history, community, and spirituality, all of which are celebrated through various customs, rituals, and festivals.\n" +
                            "\n" +
                            "A central part of Ethiopian tradition is the Coffee Ceremony, a symbolic and communal activity that plays an essential role in social gatherings. Coffee, known as \"Bunna\" in Amharic, is Ethiopia’s most iconic export and has been a cultural staple for centuries. The Ethiopian Coffee Ceremony is a ritual that involves roasting green coffee beans, grinding them by hand, and brewing the coffee in a traditional clay pot called a Jebena. This ceremony is not just about drinking coffee; it’s a symbol of respect and hospitality. It is often accompanied by the burning of frankincense and sharing of stories, making it a time for families and friends to connect.\n" +
                            "\n" +
                            "The ceremony itself is performed with great care, often by women, and is an essential part of Ethiopian hospitality. The process can take over an hour and involves multiple rounds of coffee, each serving deeper flavors and meaning. During the ceremony, the coffee is served in small cups, often with popcorn or kolo (roasted barley). This is more than a simple beverage; it is a celebration of togetherness, culture, and tradition.\n" +
                            "\n" +
                            "Beyond coffee, Ethiopian traditions are also reflected in the colorful Timkat (Epiphany) celebrations, the elaborate Meskel (Finding of the True Cross) festival, and the ancient practice of Dikr (prayer and meditation). Ethiopian culture holds deep reverence for its diverse ethnic groups, languages, and rituals, making it a uniquely rich heritage that continues to thrive today.\n" +
                            "\n" +
                            "Through its traditional music, dance, art, and culinary practices, Ethiopia remains a beacon of cultural pride and community. The coffee ceremony remains one of the most beloved customs, a reminder of the country’s enduring bond with its past and the warmth of Ethiopian hospitality.",
                    imageRes = R.drawable.tradition

                )
            )
        ),
        CultureCategory(
            id = 4,
            title = "Music",
            description = "Ethiopian music is a rich blend of ancient traditions and modern influences, reflecting the country's diverse cultures and history. From the soulful tunes of the krar and masenqo to the vibrant rhythms of traditional dances, Ethiopian music is a celebration of identity and creativity, captivating listeners with its unique sounds and melodies.",
            introImageRes = null, // No intro image
            contentSections = listOf(
                ContentSection(
                    title = "Traditional Music",
                    content = "Traditional Ethiopian music varies by region, reflecting the country’s ethnic diversity. The music is often performed using traditional instruments, such as the krar (a lyre-like string instrument), masinko (a single-stringed fiddle), and washint (a bamboo flute). In the highlands, you’ll often find a vocal tradition called zema, which is associated with religious liturgy, especially within the Ethiopian Orthodox Church. This form of singing is deeply spiritual and accompanied by instruments like the begena, a large lyre, and the kebero, a drum used in religious ceremonies.",
                    imageRes = R.drawable.music
                ),
                ContentSection(
                    title = "Modern Ethiopian Music",
                    content = "In addition to the traditional styles, modern Ethiopian music blends traditional rhythms and melodies with Western influences, such as jazz, funk, and pop. The Golden Age of Ethiopian music, which took place from the 1960s to the 1970s, saw the rise of iconic artists such as Mulatu Astatke, whose blend of jazz and traditional Ethiopian music became internationally recognized as Ethio-jazz. Other influential musicians from this period include Tilahun Gessesse and Mahmoud Ahmed, whose songs remain beloved by Ethiopians and music enthusiasts worldwide.",
                    imageRes = R.drawable.jazz
                ),
                ContentSection(
                    title = "Contemporary Trends",
                    content = "In recent years, Ethiopian music has continued to evolve, with a new generation of artists experimenting with genres like hip hop, reggae, and electronic music, while still maintaining a strong connection to their musical roots. The country’s urban centers, like Addis Ababa, have become vibrant hubs for music, with both traditional and modern music thriving in the cultural scene.\n" +
                            "\n" +
                            "Ethiopian music also plays a significant role in the celebration of various holidays and ceremonies, such as weddings, religious festivals, and national celebrations. Music is a vital part of social gatherings, expressing joy, sorrow, and community.\n" +
                            "\n" +
                            "With its combination of ancient traditions and contemporary influences, Ethiopian music remains a dynamic and influential force in the global music scene.",
                    imageRes = null
                )
            )
        ),

        CultureCategory(
            id = 5,
            title = "Regions",
            description = "Ethiopia's regions are a vibrant tapestry of cultural diversity, each offering unique traditions, languages, and landscapes. From the highlands of Amhara and Tigray to the lush greenery of Oromia and the pastoral beauty of the Somali region, every corner of Ethiopia tells a distinct story of heritage and unity.",
            introImageRes = null,
            contentSections = listOf(
                ContentSection(
                    title = "Did you know?",
                    content = "Ethiopia, a country rich in history and diversity, is divided into several distinct regions, each with its own unique cultural, linguistic, and historical significance. The regions are defined by the federal system of government, where each region is granted a certain level of autonomy, allowing them to preserve their culture, language, and traditions. Here’s an overview of the regions in Ethiopia, focusing on the notion of \"nations and nationalities.\"",
                    imageRes = R.drawable.region
                ),
                ContentSection(
                    title = "Regions in Ethiopia: Nations and Nationalities ",
                    content = "Ethiopia’s federal system is built on the principle of self-determination for various ethnic groups, each considered a \"nation\" or \"nationality\" with a right to maintain its cultural identity and governance. The Ethiopian Constitution divides the country into Regional States, each of which corresponds to a dominant ethnic group or a collection of ethnic groups. These regions are organized based on linguistic and cultural boundaries, giving Ethiopians the opportunity to preserve and celebrate their traditions.",
                    imageRes = null
                ),
                ContentSection(
                    title = "1. Addis Ababa ",
                    content = "Addis Ababa, the capital city, is the political and administrative center of Ethiopia. Though not a region in the traditional sense, it is a chartered city and serves as a federal state with a special status. The city is home to people from all over the country and serves as the heart of Ethiopia’s political, cultural, and economic activity. It hosts major institutions such as the African Union (AU) and the United Nations Economic Commission for Africa (UNECA), making it a diplomatic hub. ",
                    imageRes = null
                ),
                ContentSection(
                    title = "2. Afar Region ",
                    content = " Located in the northeastern part of Ethiopia, the Afar Region is home to the Afar people, a Cushitic ethnic group. This region is characterized by its harsh desert climate, with the Danakil Depression being one of the hottest places on Earth. The Afar people have a rich nomadic culture, deeply tied to their pastoralist traditions. Despite the challenges of the environment, the Afar people have maintained their way of life for centuries.",
                    imageRes = null
                ),
                ContentSection(
                    title = "3. Amhara Region ",
                    content = " The Amhara Region is located in the central highlands of Ethiopia. It is the birthplace of the Ethiopian Empire and the home of the Amhara people, one of the largest ethnic groups in the country. The region is known for its historical significance, including landmarks such as Lalibela's rock-hewn churches and the city of Gondar, which served as the capital of Ethiopia during the 16th and 17th centuries. The Amhara people have historically been influential in Ethiopia's politics and culture.",
                    imageRes = null
                ),
                ContentSection(
                    title = "4. Benishangul-Gumuz Region",
                    content = "Situated in the western part of Ethiopia, the Benishangul-Gumuz Region is home to several ethnic groups, including the Berta, Gumuz, and Shinasha. This region is known for its diverse wildlife and rich forests, as well as being a hub for agriculture and natural resources. It is also significant for the Grand Ethiopian Renaissance Dam (GERD), which is being constructed along the Blue Nile River, providing the region with international importance.",
                    imageRes = null
                ),
                ContentSection(
                    title = "5. Dire Dawa",
                    content = "Like Addis Ababa, Dire Dawa is a chartered city and serves as a special region. It is located in the eastern part of Ethiopia and is an important trade and transportation hub. The city is culturally diverse, with various ethnic groups, including the Oromo, Somali, and Amhara people, coexisting. It serves as a vital economic center, with a rapidly growing urban population and significant infrastructure development.",
                    imageRes = null
                ),
                ContentSection(
                    title = "6. Gambela Region",
                    content = "Located in the western part of Ethiopia, the Gambela Region is home to the Nuer, Anuak, and other indigenous ethnic groups. The region is known for its vast wetlands, forests, and wildlife. The Gambela people's traditional lifestyle revolves around fishing, hunting, and agriculture. The region has a complex history of migration and inter-ethnic relations, with a rich oral tradition and vibrant cultural heritage.",
                    imageRes = null
                ),
                ContentSection(
                    title = "7. Harari Region",
                    content = "The Harari Region is one of the smallest regions in Ethiopia but is rich in history and culture. The Harari people, known for their Islamic traditions and unique language, have lived in this region for centuries. The city of Harar is a UNESCO World Heritage site, famous for its ancient walled city, which contains over 80 mosques and 102 shrines. The Harari people are known for their distinct culture, architecture, and cuisine, making it an important cultural hub in Ethiopia.",
                    imageRes = null
                ),

            )
        ),
        CultureCategory(
            id = 6,
            title = "Economy",
            description = "Ethiopia's economy is one of the fastest-growing in Africa, driven by agriculture, industry, and services. With a rich history of trade and innovation, the country is becoming a regional hub for manufacturing, infrastructure development, and technology, while agriculture remains the backbone of its economy.",
            introImageRes = null,
            contentSections = listOf(
                ContentSection(
                    title = "Ethiopia's Economy ",
                    content = "Ethiopia, located in the Horn of Africa, has one of the fastest-growing economies on the continent. Over the past decade, the country has experienced significant economic growth, driven by agriculture, industrialization, and infrastructure development.\n" +
                            "\n" +
                            "Agriculture remains the backbone of the Ethiopian economy, employing more than 70% of the population. The country's agricultural exports, such as coffee, tea, and khat, are crucial to its foreign exchange earnings. Ethiopia is one of the world's largest coffee producers, with coffee being an integral part of both the national economy and culture. ",
                    imageRes = R.drawable.economy

                ),
                ContentSection(
                    title = "",
                    content = "In recent years, Ethiopia has been making strides toward diversifying its economy, with investments in sectors such as manufacturing, energy, and construction. The government has prioritized the development of industrial parks, which are now home to textile, garment, and light manufacturing industries. These efforts aim to reduce dependence on agriculture and increase exports of processed goods.\n" +
                            "\n" +
                            "Infrastructure projects, including roads, railways, and energy plants, have also been a focal point of Ethiopia's economic development. The Grand Ethiopian Renaissance Dam (GERD), which is under construction on the Blue Nile, is set to significantly boost the country's power generation capacity, further supporting industrial growth and economic diversification. ",
                    imageRes = R.drawable.rens
                )
            )
        ),
        CultureCategory(
            id = 7,
            title = "Scenic Areas",
            description = "Ethiopia is home to some of Africa's most breathtaking scenic areas, from the dramatic Simien Mountains to the serene lakes of the Great Rift Valley. With diverse landscapes ranging from lush highlands to arid deserts, Ethiopia offers a unique blend of natural beauty that attracts adventurers and nature lovers alike.",
            introImageRes = null,
            contentSections = listOf(
                ContentSection(
                    title = " ",
                    content = "Ethiopia is a country blessed with a wealth of natural beauty, from lush highlands to arid deserts and everything in between. The country boasts some of the most scenic areas in Africa, offering breathtaking views, diverse landscapes, and unique ecosystems.",
                    imageRes = null

                ),
                ContentSection(
                    title = "Semen Mountains",
                    content = "Ethiopia is a country blessed with a wealth of natural beauty, from lush highlands to arid deserts and everything in between. The country boasts some of the most scenic areas in Africa, offering breathtaking views, diverse landscapes, and unique ecosystems.\n" +
                            "\n" +
                            "One of the most famous scenic areas is the Simien Mountains National Park, a UNESCO World Heritage site known for its dramatic peaks, deep valleys, and rare wildlife like the Ethiopian wolf and the gelada monkey. The park is a paradise for trekkers and nature lovers, with trails that lead through lush forests and offer panoramic views of the surrounding highlands.",
                    imageRes = R.drawable.semen

                ),
                ContentSection(
                    title = "OMO National park",
                    content = "Another stunning area is the Omo Valley, where the land is dotted with traditional villages, colorful markets, and the beautiful Omo River. This region is home to various indigenous tribes, each with their unique culture and way of life. The Omo Valley's beauty lies not only in its natural surroundings but also in the rich cultural heritage it offers to visitors.",
                    imageRes = R.drawable.omo
                ),
                ContentSection(
                    title = "Laibella",
                    content = "In the northern part of the country, the Lalibela Rock-Hewn Churches are a must-see. Carved into solid rock in the 12th century, these 11 medieval churches are a marvel of architecture and a symbol of Ethiopia's ancient Christian heritage. They are surrounded by stunning mountainous landscapes that add to the awe-inspiring atmosphere of the site. ",
                    imageRes = R.drawable.laibella

                )

            )
        )
    )

}


//class CultureRepository {
//    fun getCategories(): List<CultureCategory> = listOf(
//        CultureCategory(
//            id = 1,
//            title = "Art",
//            description = "Discover the visual arts that define our culture.",
//            contentSections = listOf(
//                "The arts have always been an integral part of our culture, with a rich history of visual expression.",
//                "Artists throughout the years have used various mediums to capture the essence of our society's values.",
//                "Today, contemporary artists continue to reflect the cultural shifts in our ever-evolving world."
//            ),
//            imageResourceId = R.drawable.art
//
//        ),
//        CultureCategory(
//            id = 2,
//            title = "Music",
//            description = "Experience the traditional and modern music of our country.",
//            contentSections = listOf(
//                "Music is the heartbeat of our culture, with roots tracing back to ancient rituals and celebrations.",
//                "Traditional music is still performed in many parts of the country, passed down through generations.",
//                "Modern music has fused with global influences, creating new sounds that resonate with people worldwide."
//            ),
//            imageResourceId = R.drawable.music
//        ),
//        CultureCategory(
//            id = 3,
//            title = "History",
//            description = "Learn about the historical events that shaped our identity.",
//            contentSections = listOf(
//                "Music is the heartbeat of our culture, with roots tracing back to ancient rituals and celebrations.",
//                "Traditional music is still performed in many parts of the country, passed down through generations.",
//                "Modern music has fused with global influences, creating new sounds that resonate with people worldwide."
//            ),
//            imageResourceId = R.drawable.history
//        ),
//        CultureCategory(
//            id = 4,
//            title = "Traditions",
//            description = "Explore the rich traditions and customs of our society.",
//            contentSections = listOf(
//                "Music is the heartbeat of our culture, with roots tracing back to ancient rituals and celebrations.",
//                "Traditional music is still performed in many parts of the country, passed down through generations.",
//                "Modern music has fused with global influences, creating new sounds that resonate with people worldwide."
//            ),
//            imageResourceId = R.drawable.tradition
//        ),
//        CultureCategory(
//            id = 5,
//            title = "Regions",
//            description = "Explore the nation and the nationalities of Ethiopia .",
//            contentSections = listOf(
//                "Music is the heartbeat of our culture, with roots tracing back to ancient rituals and celebrations.",
//                "Traditional music is still performed in many parts of the country, passed down through generations.",
//                "Modern music has fused with global influences, creating new sounds that resonate with people worldwide."
//            ),
//            imageResourceId = R.drawable.region
//        ),
//        CultureCategory(
//            id = 6,
//            title = "Economy",
//            description = "Explore the economy of Ethiopia .",
//            contentSections = listOf(
//                "Music is the heartbeat of our culture, with roots tracing back to ancient rituals and celebrations.",
//                "Traditional music is still performed in many parts of the country, passed down through generations.",
//                "Modern music has fused with global influences, creating new sounds that resonate with people worldwide."
//            )
//        ),
//        imageResourceId = R.drawable.economy
//
//    )
//}