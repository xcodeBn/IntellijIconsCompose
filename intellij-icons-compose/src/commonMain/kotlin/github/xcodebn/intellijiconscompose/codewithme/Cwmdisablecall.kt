package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmdisablecall: ImageVector
    get() {
        if (_Cwmdisablecall != null) return _Cwmdisablecall!!

        _Cwmdisablecall = ImageVector.Builder(
            name = "Cwmdisablecall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(13f, 2f)
                lineTo(11f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 10f)
                lineTo(9f, 11f)
                lineTo(11f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _Cwmdisablecall!!
    }

private var _Cwmdisablecall: ImageVector? = null

