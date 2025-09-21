package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Readaccess: ImageVector
    get() {
        if (_Readaccess != null) return _Readaccess!!

        _Readaccess = ImageVector.Builder(
            name = "Readaccess",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                lineTo(5f, 3f)
                lineTo(6f, 3f)
                lineTo(8f, 1f)
                lineTo(11f, 4f)
                lineTo(8f, 8f)
                lineTo(6f, 6f)
                lineTo(5f, 6f)
                lineTo(8f, 9f)
                lineTo(12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 7f)
                lineTo(0f, 5f)
                lineTo(3f, 2f)
                lineTo(3f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 5f)
                lineTo(3f, 5f)
                close()
            }
        }.build()

        return _Readaccess!!
    }

private var _Readaccess: ImageVector? = null

