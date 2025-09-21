package github.xcodebn.intellijiconscompose.xml.browsers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Yandex: ImageVector
    get() {
        if (_Yandex != null) return _Yandex!!

        _Yandex = ImageVector.Builder(
            name = "Yandex",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFF0000))
            ) {
                moveTo(4f, 3f)
                lineTo(2f, 4f)
                lineTo(6f, 8f)
                lineTo(6f, 12f)
                lineTo(8f, 12f)
                lineTo(8f, 8f)
                lineTo(12f, 4f)
                lineTo(10f, 3f)
                lineTo(7f, 6f)
                lineTo(4f, 3f)
            }
        }.build()

        return _Yandex!!
    }

private var _Yandex: ImageVector? = null

