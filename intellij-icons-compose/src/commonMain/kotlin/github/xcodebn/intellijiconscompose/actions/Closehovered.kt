package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Closehovered: ImageVector
    get() {
        if (_Closehovered != null) return _Closehovered!!

        _Closehovered = ImageVector.Builder(
            name = "Closehovered",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(11.45f, 14.25f, 14.25f, 11.45f, 14.25f, 8.00f)
                curveTo(14.25f, 4.55f, 11.45f, 1.75f, 8.00f, 1.75f)
                curveTo(4.55f, 1.75f, 1.75f, 4.55f, 1.75f, 8.00f)
                curveTo(1.75f, 11.45f, 4.55f, 14.25f, 8.00f, 14.25f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 5f)
                lineTo(8f, 7f)
                lineTo(11f, 5f)
                lineTo(11f, 5f)
                lineTo(9f, 8f)
                lineTo(11f, 11f)
                lineTo(11f, 11f)
                lineTo(8f, 9f)
                lineTo(5f, 11f)
                lineTo(5f, 11f)
                lineTo(7f, 8f)
                lineTo(5f, 5f)
                close()
            }
        }.build()

        return _Closehovered!!
    }

private var _Closehovered: ImageVector? = null

