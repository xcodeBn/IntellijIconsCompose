package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Closesmall: ImageVector
    get() {
        if (_Closesmall != null) return _Closesmall!!

        _Closesmall = ImageVector.Builder(
            name = "Closesmall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 1f)
                lineTo(6f, 1f)
                lineTo(5f, 10f)
                lineTo(4f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1f)
                lineTo(5f, 1f)
                lineTo(6f, 10f)
                lineTo(5f, 10f)
                close()
            }
        }.build()

        return _Closesmall!!
    }

private var _Closesmall: ImageVector? = null

