package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PreviewDark: ImageVector
    get() {
        if (_PreviewDark != null) return _PreviewDark!!

        _PreviewDark = ImageVector.Builder(
            name = "PreviewDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(6f, 13f)
                curveTo(3.06f, 13.20f, 1.00f, 11.14f, 1.00f, 8.60f)
                curveTo(1.00f, 6.06f, 3.06f, 4.00f, 5.60f, 4.00f)
                curveTo(8.14f, 4.00f, 10.20f, 6.06f, 10.20f, 8.60f)
                curveTo(10.20f, 11.14f, 8.14f, 13.20f, 5.60f, 13.20f)
                close()
                moveTo(6f, 12f)
                curveTo(7.26f, 11.60f, 8.60f, 10.26f, 8.60f, 8.60f)
                curveTo(8.60f, 6.94f, 7.26f, 5.60f, 5.60f, 5.60f)
                curveTo(3.94f, 5.60f, 2.60f, 6.94f, 2.60f, 8.60f)
                curveTo(2.60f, 10.26f, 3.94f, 11.60f, 5.60f, 11.60f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 5f)
                curveTo(9.57f, 4.62f, 9.20f, 4.28f, 8.79f, 4.00f)
                lineTo(13f, 4f)
                lineTo(13f, 3f)
                lineTo(8f, 3f)
                lineTo(8f, 4f)
                curveTo(7.39f, 3.25f, 6.71f, 3.06f, 6.00f, 3.01f)
                lineTo(6f, 1f)
                lineTo(15f, 1f)
                lineTo(15f, 11f)
                lineTo(11f, 11f)
                curveTo(11.01f, 10.27f, 11.20f, 9.46f, 11.20f, 8.60f)
                curveTo(11.20f, 8.40f, 11.19f, 8.20f, 11.17f, 8.00f)
                lineTo(13f, 8f)
                lineTo(13f, 7f)
                lineTo(11f, 7f)
                curveTo(10.86f, 6.65f, 10.73f, 6.32f, 10.56f, 6.00f)
                lineTo(13f, 6f)
                lineTo(13f, 5f)
                lineTo(10f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(6f, 13f)
                    curveTo(3.06f, 13.20f, 1.00f, 11.14f, 1.00f, 8.60f)
                    curveTo(1.00f, 6.06f, 3.06f, 4.00f, 5.60f, 4.00f)
                    curveTo(8.14f, 4.00f, 10.20f, 6.06f, 10.20f, 8.60f)
                    curveTo(10.20f, 11.14f, 8.14f, 13.20f, 5.60f, 13.20f)
                    close()
                    moveTo(6f, 12f)
                    curveTo(7.26f, 11.60f, 8.60f, 10.26f, 8.60f, 8.60f)
                    curveTo(8.60f, 6.94f, 7.26f, 5.60f, 5.60f, 5.60f)
                    curveTo(3.94f, 5.60f, 2.60f, 6.94f, 2.60f, 8.60f)
                    curveTo(2.60f, 10.26f, 3.94f, 11.60f, 5.60f, 11.60f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(10f, 5f)
                    curveTo(9.57f, 4.62f, 9.20f, 4.28f, 8.79f, 4.00f)
                    lineTo(13f, 4f)
                    lineTo(13f, 3f)
                    lineTo(8f, 3f)
                    lineTo(8f, 4f)
                    curveTo(7.39f, 3.25f, 6.71f, 3.06f, 6.00f, 3.01f)
                    lineTo(6f, 1f)
                    lineTo(15f, 1f)
                    lineTo(15f, 11f)
                    lineTo(11f, 11f)
                    curveTo(11.01f, 10.27f, 11.20f, 9.46f, 11.20f, 8.60f)
                    curveTo(11.20f, 8.40f, 11.19f, 8.20f, 11.17f, 8.00f)
                    lineTo(13f, 8f)
                    lineTo(13f, 7f)
                    lineTo(11f, 7f)
                    curveTo(10.86f, 6.65f, 10.73f, 6.32f, 10.56f, 6.00f)
                    lineTo(13f, 6f)
                    lineTo(13f, 5f)
                    lineTo(10f, 5f)
                    close()
                }
            }
        }.build()

        return _PreviewDark!!
    }

private var _PreviewDark: ImageVector? = null

