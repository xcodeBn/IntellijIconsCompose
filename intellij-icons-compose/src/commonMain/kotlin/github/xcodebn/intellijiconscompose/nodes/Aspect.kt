package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Aspect: ImageVector
    get() {
        if (_Aspect != null) return _Aspect!!

        _Aspect = ImageVector.Builder(
            name = "Aspect",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(2f, 14f)
                lineTo(14f, 14f)
                lineTo(14f, 2f)
                lineTo(2f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 7f)
                lineTo(4f, 7f)
                lineTo(4f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 9f)
                lineTo(12f, 9f)
                close()
            }
        }.build()

        return _Aspect!!
    }

private var _Aspect: ImageVector? = null

