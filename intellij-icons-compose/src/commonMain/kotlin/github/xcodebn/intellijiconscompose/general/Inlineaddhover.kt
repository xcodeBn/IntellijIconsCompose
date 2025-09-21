package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlineaddhover: ImageVector
    get() {
        if (_Inlineaddhover != null) return _Inlineaddhover!!

        _Inlineaddhover = ImageVector.Builder(
            name = "Inlineaddhover",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 7f)
                lineTo(13f, 7f)
                lineTo(13f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 3f)
                lineTo(9f, 3f)
                lineTo(9f, 7f)
                close()
            }
        }.build()

        return _Inlineaddhover!!
    }

private var _Inlineaddhover: ImageVector? = null

