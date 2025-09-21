package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddiconDark: ImageVector
    get() {
        if (_AddiconDark != null) return _AddiconDark!!

        _AddiconDark = ImageVector.Builder(
            name = "AddiconDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(12f, 16f)
                lineTo(12f, 13f)
                lineTo(10f, 15f)
                lineTo(9f, 14f)
                lineTo(11f, 12f)
                lineTo(9f, 11f)
                lineTo(10f, 10f)
                lineTo(12f, 12f)
                lineTo(12f, 9f)
                lineTo(13f, 9f)
                lineTo(13f, 12f)
                lineTo(15f, 10f)
                lineTo(16f, 11f)
                lineTo(13f, 12f)
                lineTo(16f, 14f)
                lineTo(15f, 15f)
                lineTo(13f, 13f)
                lineTo(13f, 16f)
                close()
            }
        }.build()

        return _AddiconDark!!
    }

private var _AddiconDark: ImageVector? = null

