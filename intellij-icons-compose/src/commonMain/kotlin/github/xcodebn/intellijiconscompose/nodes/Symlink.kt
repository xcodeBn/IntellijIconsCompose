package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Symlink: ImageVector
    get() {
        if (_Symlink != null) return _Symlink!!

        _Symlink = ImageVector.Builder(
            name = "Symlink",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(9f, 7f)
                lineTo(16f, 7f)
                lineTo(16f, 0f)
                lineTo(9f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(14f, 1f)
                lineTo(14f, 1f)
                lineTo(10f, 1f)
                lineTo(10f, 2f)
                lineTo(13f, 2f)
                lineTo(10f, 5f)
                lineTo(11f, 6f)
                lineTo(14f, 3f)
                lineTo(14f, 6f)
                lineTo(15f, 6f)
                lineTo(15f, 2f)
                lineTo(15f, 1f)
                close()
            }
        }.build()

        return _Symlink!!
    }

private var _Symlink: ImageVector? = null

