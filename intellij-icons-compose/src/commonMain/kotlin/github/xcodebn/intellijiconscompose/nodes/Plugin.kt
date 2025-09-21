package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Plugin: ImageVector
    get() {
        if (_Plugin != null) return _Plugin!!

        _Plugin = ImageVector.Builder(
            name = "Plugin",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6f)
                curveTo(3.00f, 6.31f, 3.18f, 6.61f, 3.47f, 6.75f)
                lineTo(4f, 7f)
                curveTo(4.02f, 7.03f, 4.28f, 7.02f, 4.50f, 6.92f)
                lineTo(4f, 6f)
                lineTo(4f, 4f)
                lineTo(4f, 3f)
                curveTo(4.28f, 2.98f, 4.02f, 2.97f, 3.78f, 3.09f)
                lineTo(3f, 3f)
                curveTo(3.18f, 3.39f, 3.00f, 3.69f, 3.00f, 4.01f)
                lineTo(3f, 4f)
                lineTo(3f, 6f)
                lineTo(3f, 6f)
                close()
                moveTo(6f, 14f)
                curveTo(4.11f, 14.00f, 1.98f, 11.82f, 2.00f, 10.00f)
                lineTo(2f, 8f)
                curveTo(2.00f, 6.58f, 2.57f, 6.00f, 3.00f, 6.00f)
                lineTo(3f, 4f)
                curveTo(1.90f, 4.00f, 1.00f, 6.08f, 1.00f, 8.00f)
                lineTo(1f, 10f)
                curveTo(1.00f, 12.73f, 3.60f, 15.00f, 6.00f, 15.00f)
                lineTo(11f, 15f)
                lineTo(11f, 14f)
                lineTo(6f, 14f)
                close()
                moveTo(7f, 1f)
                lineTo(11f, 1f)
                lineTo(11f, 9f)
                lineTo(11f, 9f)
                lineTo(10f, 9f)
                lineTo(7f, 9f)
                curveTo(5.96f, 9.00f, 5.00f, 7.92f, 5.00f, 6.60f)
                lineTo(5f, 3f)
                curveTo(5.00f, 2.08f, 5.96f, 1.00f, 7.14f, 1.00f)
                close()
                moveTo(12f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 8f)
                close()
                moveTo(12f, 3f)
                lineTo(15f, 3f)
                lineTo(15f, 2f)
                lineTo(12f, 2f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _Plugin!!
    }

private var _Plugin: ImageVector? = null

