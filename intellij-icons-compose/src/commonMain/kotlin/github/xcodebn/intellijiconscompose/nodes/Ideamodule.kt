package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ideamodule: ImageVector
    get() {
        if (_Ideamodule != null) return _Ideamodule!!

        _Ideamodule = ImageVector.Builder(
            name = "Ideamodule",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(10f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 10f)
                lineTo(10f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE0E0E0))
            ) {
                moveTo(11f, 15f)
                lineTo(14f, 15f)
                lineTo(14f, 14f)
                lineTo(11f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 5f)
                lineTo(8f, 6f)
                lineTo(7f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 15f)
                lineTo(9f, 15f)
                lineTo(9f, 9f)
                lineTo(13f, 9f)
                lineTo(13f, 1f)
                close()
            }
        }.build()

        return _Ideamodule!!
    }

private var _Ideamodule: ImageVector? = null

