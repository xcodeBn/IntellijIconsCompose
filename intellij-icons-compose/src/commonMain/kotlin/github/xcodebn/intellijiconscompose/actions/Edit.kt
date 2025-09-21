package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!

        _Edit = ImageVector.Builder(
            name = "Edit",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 7f)
                lineTo(9f, 4f)
                lineTo(2f, 11f)
                lineTo(2f, 14f)
                lineTo(5f, 14f)
                lineTo(12f, 7f)
                close()
                moveTo(15f, 4f)
                curveTo(15.12f, 3.92f, 15.12f, 3.06f, 14.80f, 2.74f)
                lineTo(13f, 1f)
                curveTo(12.98f, 0.92f, 12.12f, 0.92f, 11.80f, 1.24f)
                lineTo(10f, 3f)
                lineTo(13f, 6f)
                lineTo(15f, 4f)
                close()
            }
        }.build()

        return _Edit!!
    }

private var _Edit: ImageVector? = null

