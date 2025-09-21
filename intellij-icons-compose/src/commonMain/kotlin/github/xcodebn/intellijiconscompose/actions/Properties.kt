package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Properties: ImageVector
    get() {
        if (_Properties != null) return _Properties!!

        _Properties = ImageVector.Builder(
            name = "Properties",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 11f)
                curveTo(9.74f, 11.00f, 10.39f, 11.40f, 10.73f, 12.00f)
                lineTo(15f, 12f)
                lineTo(15f, 14f)
                lineTo(11f, 14f)
                curveTo(10.39f, 14.60f, 9.74f, 15.00f, 9.00f, 15.00f)
                curveTo(8.26f, 15.00f, 7.61f, 14.60f, 7.27f, 14.00f)
                lineTo(1f, 14f)
                lineTo(1f, 12f)
                lineTo(7f, 12f)
                curveTo(7.61f, 11.40f, 8.26f, 11.00f, 9.00f, 11.00f)
                close()
                moveTo(9f, 12f)
                curveTo(8.45f, 12.00f, 8.00f, 12.45f, 8.00f, 13.00f)
                curveTo(8.00f, 13.55f, 8.45f, 14.00f, 9.00f, 14.00f)
                curveTo(9.55f, 14.00f, 10.00f, 13.55f, 10.00f, 13.00f)
                curveTo(10.00f, 12.45f, 9.55f, 12.00f, 9.00f, 12.00f)
                close()
                moveTo(6f, 6f)
                curveTo(6.74f, 6.00f, 7.39f, 6.40f, 7.73f, 7.00f)
                lineTo(15f, 7f)
                lineTo(15f, 9f)
                lineTo(8f, 9f)
                curveTo(7.39f, 9.60f, 6.74f, 10.00f, 6.00f, 10.00f)
                curveTo(5.26f, 10.00f, 4.61f, 9.60f, 4.27f, 9.00f)
                lineTo(1f, 9f)
                lineTo(1f, 7f)
                lineTo(4f, 7f)
                curveTo(4.61f, 6.40f, 5.26f, 6.00f, 6.00f, 6.00f)
                close()
                moveTo(6f, 7f)
                curveTo(5.45f, 7.00f, 5.00f, 7.45f, 5.00f, 8.00f)
                curveTo(5.00f, 8.55f, 5.45f, 9.00f, 6.00f, 9.00f)
                curveTo(6.55f, 9.00f, 7.00f, 8.55f, 7.00f, 8.00f)
                curveTo(7.00f, 7.45f, 6.55f, 7.00f, 6.00f, 7.00f)
                close()
                moveTo(11f, 1f)
                curveTo(11.74f, 1.00f, 12.39f, 1.40f, 12.73f, 2.00f)
                lineTo(15f, 2f)
                lineTo(15f, 4f)
                lineTo(13f, 4f)
                curveTo(12.39f, 4.60f, 11.74f, 5.00f, 11.00f, 5.00f)
                curveTo(10.26f, 5.00f, 9.61f, 4.60f, 9.27f, 4.00f)
                lineTo(1f, 4f)
                lineTo(1f, 2f)
                lineTo(9f, 2f)
                curveTo(9.61f, 1.40f, 10.26f, 1.00f, 11.00f, 1.00f)
                close()
                moveTo(11f, 2f)
                curveTo(10.45f, 2.00f, 10.00f, 2.45f, 10.00f, 3.00f)
                curveTo(10.00f, 3.55f, 10.45f, 4.00f, 11.00f, 4.00f)
                curveTo(11.55f, 4.00f, 12.00f, 3.55f, 12.00f, 3.00f)
                curveTo(12.00f, 2.45f, 11.55f, 2.00f, 11.00f, 2.00f)
                close()
            }
        }.build()

        return _Properties!!
    }

private var _Properties: ImageVector? = null

