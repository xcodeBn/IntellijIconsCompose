package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gc: ImageVector
    get() {
        if (_Gc != null) return _Gc!!

        _Gc = ImageVector.Builder(
            name = "Gc",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 2f)
                lineTo(6f, 1f)
                lineTo(10f, 1f)
                lineTo(10f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 2f)
                lineTo(6f, 2f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 13f)
                curveTo(12.00f, 13.42f, 11.40f, 14.00f, 10.67f, 14.00f)
                lineTo(5f, 14f)
                curveTo(4.60f, 14.00f, 4.00f, 13.42f, 4.00f, 12.71f)
                close()
            }
        }.build()

        return _Gc!!
    }

private var _Gc: ImageVector? = null

