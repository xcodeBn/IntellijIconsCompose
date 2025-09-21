package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolbox: ImageVector
    get() {
        if (_Toolbox != null) return _Toolbox!!

        _Toolbox = ImageVector.Builder(
            name = "Toolbox",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(10f, 10f)
                lineTo(7f, 11f)
                lineTo(7f, 10f)
                lineTo(10f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000001))
            ) {
                moveTo(6f, 14f)
                lineTo(12f, 10f)
                lineTo(12f, 3f)
                lineTo(6f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(7f, 11f)
                lineTo(7f, 12f)
                lineTo(10f, 10f)
                lineTo(10f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Black)
            ) {
                moveTo(6f, 0f)
                lineTo(0f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 10f)
                lineTo(6f, 14f)
                lineTo(6f, 7f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _Toolbox!!
    }

private var _Toolbox: ImageVector? = null

