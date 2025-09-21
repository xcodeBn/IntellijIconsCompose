package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Custom: ImageVector
    get() {
        if (_Custom != null) return _Custom!!

        _Custom = ImageVector.Builder(
            name = "Custom",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(6f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                lineTo(13f, 1f)
                lineTo(13f, 6f)
                curveTo(12.55f, 6.13f, 12.04f, 6.00f, 11.50f, 6.00f)
                curveTo(9.71f, 6.00f, 8.25f, 7.46f, 8.25f, 9.25f)
                curveTo(8.25f, 10.33f, 8.77f, 11.28f, 9.58f, 11.87f)
                curveTo(7.85f, 12.27f, 6.00f, 13.16f, 6.00f, 14.54f)
                lineTo(6f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(12f, 12f)
                curveTo(12.74f, 11.50f, 13.75f, 10.49f, 13.75f, 9.25f)
                curveTo(13.75f, 8.01f, 12.74f, 7.00f, 11.50f, 7.00f)
                curveTo(10.26f, 7.00f, 9.25f, 8.01f, 9.25f, 9.25f)
                curveTo(9.25f, 10.49f, 10.26f, 11.50f, 11.50f, 11.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(12f, 13f)
                curveTo(10.00f, 12.62f, 7.00f, 13.38f, 7.00f, 14.88f)
                lineTo(7f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 15f)
                curveTo(16.00f, 13.38f, 13.00f, 12.62f, 11.50f, 12.62f)
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
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(6f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 6f)
                    lineTo(8f, 6f)
                    lineTo(8f, 1f)
                    lineTo(13f, 1f)
                    lineTo(13f, 6f)
                    curveTo(12.55f, 6.13f, 12.04f, 6.00f, 11.50f, 6.00f)
                    curveTo(9.71f, 6.00f, 8.25f, 7.46f, 8.25f, 9.25f)
                    curveTo(8.25f, 10.33f, 8.77f, 11.28f, 9.58f, 11.87f)
                    curveTo(7.85f, 12.27f, 6.00f, 13.16f, 6.00f, 14.54f)
                    lineTo(6f, 15f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(12f, 12f)
                    curveTo(12.74f, 11.50f, 13.75f, 10.49f, 13.75f, 9.25f)
                    curveTo(13.75f, 8.01f, 12.74f, 7.00f, 11.50f, 7.00f)
                    curveTo(10.26f, 7.00f, 9.25f, 8.01f, 9.25f, 9.25f)
                    curveTo(9.25f, 10.49f, 10.26f, 11.50f, 11.50f, 11.50f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(12f, 13f)
                    curveTo(10.00f, 12.62f, 7.00f, 13.38f, 7.00f, 14.88f)
                    lineTo(7f, 16f)
                    lineTo(16f, 16f)
                    lineTo(16f, 15f)
                    curveTo(16.00f, 13.38f, 13.00f, 12.62f, 11.50f, 12.62f)
                    close()
                }
            }
        }.build()

        return _Custom!!
    }

private var _Custom: ImageVector? = null

