package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Css: ImageVector
    get() {
        if (_Css != null) return _Css!!

        _Css = ImageVector.Builder(
            name = "Css",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF98B9E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 13f)
                curveTo(2.00f, 11.00f, 2.93f, 10.00f, 4.26f, 10.00f)
                curveTo(5.20f, 10.00f, 5.55f, 10.31f, 5.97f, 10.75f)
                lineTo(5f, 11f)
                curveTo(5.08f, 11.07f, 4.75f, 11.00f, 4.25f, 11.00f)
                curveTo(3.42f, 11.00f, 3.00f, 11.74f, 3.00f, 12.49f)
                curveTo(3.00f, 13.24f, 3.41f, 14.00f, 4.25f, 14.00f)
                curveTo(4.79f, 14.00f, 5.05f, 13.89f, 5.43f, 13.51f)
                lineTo(6f, 14f)
                curveTo(5.54f, 14.67f, 5.20f, 15.00f, 4.22f, 15.00f)
                curveTo(2.95f, 15.00f, 2.00f, 14.00f, 2.00f, 12.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 12f)
                curveTo(7.97f, 11.13f, 8.28f, 11.00f, 8.85f, 11.00f)
                curveTo(8.85f, 11.00f, 10.00f, 11.00f, 10.00f, 11.00f)
                verticalLineTo(10f)
                curveTo(10.00f, 10.00f, 8.89f, 10.00f, 8.86f, 10.00f)
                curveTo(7.78f, 10.00f, 7.00f, 10.46f, 7.00f, 11.45f)
                curveTo(7.00f, 12.31f, 7.42f, 12.69f, 8.47f, 12.92f)
                curveTo(9.24f, 13.08f, 9.50f, 13.23f, 9.50f, 13.55f)
                curveTo(9.50f, 13.87f, 9.14f, 14.00f, 8.47f, 14.00f)
                curveTo(8.46f, 14.00f, 7.30f, 14.00f, 7.30f, 14.00f)
                verticalLineTo(15f)
                curveTo(7.30f, 15.00f, 8.46f, 15.00f, 8.47f, 15.00f)
                curveTo(10.50f, 15.00f, 10.50f, 14.00f, 10.50f, 13.55f)
                curveTo(10.50f, 12.92f, 10.02f, 12.42f, 9.16f, 12.15f)
                curveTo(8.30f, 11.87f, 7.97f, 11.87f, 7.97f, 11.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                curveTo(11.97f, 11.13f, 12.28f, 11.00f, 12.85f, 11.00f)
                curveTo(12.85f, 11.00f, 14.00f, 11.00f, 14.00f, 11.00f)
                verticalLineTo(10f)
                curveTo(14.00f, 10.00f, 12.89f, 10.00f, 12.86f, 10.00f)
                curveTo(11.78f, 10.00f, 11.00f, 10.46f, 11.00f, 11.45f)
                curveTo(11.00f, 12.31f, 11.42f, 12.69f, 12.47f, 12.92f)
                curveTo(13.24f, 13.08f, 13.50f, 13.23f, 13.50f, 13.55f)
                curveTo(13.50f, 13.87f, 13.14f, 14.00f, 12.47f, 14.00f)
                curveTo(12.46f, 14.00f, 11.30f, 14.00f, 11.30f, 14.00f)
                verticalLineTo(15f)
                curveTo(11.30f, 15.00f, 12.46f, 15.00f, 12.47f, 15.00f)
                curveTo(14.50f, 15.00f, 14.50f, 14.00f, 14.50f, 13.55f)
                curveTo(14.50f, 12.92f, 14.02f, 12.42f, 13.16f, 12.15f)
                curveTo(12.30f, 11.87f, 11.97f, 11.87f, 11.97f, 11.50f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 1f)
                    lineTo(3f, 5f)
                    horizontalLineTo(7f)
                    verticalLineTo(1f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF9AA7B0)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 1f)
                    verticalLineTo(6f)
                    horizontalLineTo(3f)
                    verticalLineTo(8f)
                    horizontalLineTo(13f)
                    verticalLineTo(1f)
                    horizontalLineTo(8f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFF98B9E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(1f, 16f)
                    horizontalLineTo(16f)
                    verticalLineTo(9f)
                    horizontalLineTo(1f)
                    verticalLineTo(16f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 13f)
                    curveTo(2.00f, 11.00f, 2.93f, 10.00f, 4.26f, 10.00f)
                    curveTo(5.20f, 10.00f, 5.55f, 10.31f, 5.97f, 10.75f)
                    lineTo(5f, 11f)
                    curveTo(5.08f, 11.07f, 4.75f, 11.00f, 4.25f, 11.00f)
                    curveTo(3.42f, 11.00f, 3.00f, 11.74f, 3.00f, 12.49f)
                    curveTo(3.00f, 13.24f, 3.41f, 14.00f, 4.25f, 14.00f)
                    curveTo(4.79f, 14.00f, 5.05f, 13.89f, 5.43f, 13.51f)
                    lineTo(6f, 14f)
                    curveTo(5.54f, 14.67f, 5.20f, 15.00f, 4.22f, 15.00f)
                    curveTo(2.95f, 15.00f, 2.00f, 14.00f, 2.00f, 12.50f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 12f)
                    curveTo(7.97f, 11.13f, 8.28f, 11.00f, 8.85f, 11.00f)
                    curveTo(8.85f, 11.00f, 10.00f, 11.00f, 10.00f, 11.00f)
                    verticalLineTo(10f)
                    curveTo(10.00f, 10.00f, 8.89f, 10.00f, 8.86f, 10.00f)
                    curveTo(7.78f, 10.00f, 7.00f, 10.46f, 7.00f, 11.45f)
                    curveTo(7.00f, 12.31f, 7.42f, 12.69f, 8.47f, 12.92f)
                    curveTo(9.24f, 13.08f, 9.50f, 13.23f, 9.50f, 13.55f)
                    curveTo(9.50f, 13.87f, 9.14f, 14.00f, 8.47f, 14.00f)
                    curveTo(8.46f, 14.00f, 7.30f, 14.00f, 7.30f, 14.00f)
                    verticalLineTo(15f)
                    curveTo(7.30f, 15.00f, 8.46f, 15.00f, 8.47f, 15.00f)
                    curveTo(10.50f, 15.00f, 10.50f, 14.00f, 10.50f, 13.55f)
                    curveTo(10.50f, 12.92f, 10.02f, 12.42f, 9.16f, 12.15f)
                    curveTo(8.30f, 11.87f, 7.97f, 11.87f, 7.97f, 11.50f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 12f)
                    curveTo(11.97f, 11.13f, 12.28f, 11.00f, 12.85f, 11.00f)
                    curveTo(12.85f, 11.00f, 14.00f, 11.00f, 14.00f, 11.00f)
                    verticalLineTo(10f)
                    curveTo(14.00f, 10.00f, 12.89f, 10.00f, 12.86f, 10.00f)
                    curveTo(11.78f, 10.00f, 11.00f, 10.46f, 11.00f, 11.45f)
                    curveTo(11.00f, 12.31f, 11.42f, 12.69f, 12.47f, 12.92f)
                    curveTo(13.24f, 13.08f, 13.50f, 13.23f, 13.50f, 13.55f)
                    curveTo(13.50f, 13.87f, 13.14f, 14.00f, 12.47f, 14.00f)
                    curveTo(12.46f, 14.00f, 11.30f, 14.00f, 11.30f, 14.00f)
                    verticalLineTo(15f)
                    curveTo(11.30f, 15.00f, 12.46f, 15.00f, 12.47f, 15.00f)
                    curveTo(14.50f, 15.00f, 14.50f, 14.00f, 14.50f, 13.55f)
                    curveTo(14.50f, 12.92f, 14.02f, 12.42f, 13.16f, 12.15f)
                    curveTo(12.30f, 11.87f, 11.97f, 11.87f, 11.97f, 11.50f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 13f)
                    curveTo(2.00f, 11.00f, 2.93f, 10.00f, 4.26f, 10.00f)
                    curveTo(5.20f, 10.00f, 5.55f, 10.31f, 5.97f, 10.75f)
                    lineTo(5f, 11f)
                    curveTo(5.08f, 11.07f, 4.75f, 11.00f, 4.25f, 11.00f)
                    curveTo(3.42f, 11.00f, 3.00f, 11.74f, 3.00f, 12.49f)
                    curveTo(3.00f, 13.24f, 3.41f, 14.00f, 4.25f, 14.00f)
                    curveTo(4.79f, 14.00f, 5.05f, 13.89f, 5.43f, 13.51f)
                    lineTo(6f, 14f)
                    curveTo(5.54f, 14.67f, 5.20f, 15.00f, 4.22f, 15.00f)
                    curveTo(2.95f, 15.00f, 2.00f, 14.00f, 2.00f, 12.50f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 12f)
                    curveTo(7.97f, 11.13f, 8.28f, 11.00f, 8.85f, 11.00f)
                    curveTo(8.85f, 11.00f, 10.00f, 11.00f, 10.00f, 11.00f)
                    verticalLineTo(10f)
                    curveTo(10.00f, 10.00f, 8.89f, 10.00f, 8.86f, 10.00f)
                    curveTo(7.78f, 10.00f, 7.00f, 10.46f, 7.00f, 11.45f)
                    curveTo(7.00f, 12.31f, 7.42f, 12.69f, 8.47f, 12.92f)
                    curveTo(9.24f, 13.08f, 9.50f, 13.23f, 9.50f, 13.55f)
                    curveTo(9.50f, 13.87f, 9.14f, 14.00f, 8.47f, 14.00f)
                    curveTo(8.46f, 14.00f, 7.30f, 14.00f, 7.30f, 14.00f)
                    verticalLineTo(15f)
                    curveTo(7.30f, 15.00f, 8.46f, 15.00f, 8.47f, 15.00f)
                    curveTo(10.50f, 15.00f, 10.50f, 14.00f, 10.50f, 13.55f)
                    curveTo(10.50f, 12.92f, 10.02f, 12.42f, 9.16f, 12.15f)
                    curveTo(8.30f, 11.87f, 7.97f, 11.87f, 7.97f, 11.50f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF231F20)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 12f)
                    curveTo(11.97f, 11.13f, 12.28f, 11.00f, 12.85f, 11.00f)
                    curveTo(12.85f, 11.00f, 14.00f, 11.00f, 14.00f, 11.00f)
                    verticalLineTo(10f)
                    curveTo(14.00f, 10.00f, 12.89f, 10.00f, 12.86f, 10.00f)
                    curveTo(11.78f, 10.00f, 11.00f, 10.46f, 11.00f, 11.45f)
                    curveTo(11.00f, 12.31f, 11.42f, 12.69f, 12.47f, 12.92f)
                    curveTo(13.24f, 13.08f, 13.50f, 13.23f, 13.50f, 13.55f)
                    curveTo(13.50f, 13.87f, 13.14f, 14.00f, 12.47f, 14.00f)
                    curveTo(12.46f, 14.00f, 11.30f, 14.00f, 11.30f, 14.00f)
                    verticalLineTo(15f)
                    curveTo(11.30f, 15.00f, 12.46f, 15.00f, 12.47f, 15.00f)
                    curveTo(14.50f, 15.00f, 14.50f, 14.00f, 14.50f, 13.55f)
                    curveTo(14.50f, 12.92f, 14.02f, 12.42f, 13.16f, 12.15f)
                    curveTo(12.30f, 11.87f, 11.97f, 11.87f, 11.97f, 11.50f)
                    close()
                }
            }
        }.build()

        return _Css!!
    }

private var _Css: ImageVector? = null

